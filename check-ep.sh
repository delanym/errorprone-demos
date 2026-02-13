#!/bin/bash

GREEN='\033[1;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

if [[ $# -ne 2 ]]; then
    printf "Usage: %s <ErrorProneCheck> <JavaFile>\n" "$0"
    exit 1
fi

CHECK="$1"
JAVA_FILE="$2"

printf "${GREEN}==== Running check for $CHECK ====${NC}\n"

if [[ ! -f "$JAVA_FILE" ]]; then
    printf "${YELLOW}Skipping file '%s' as not found.${NC}\n" "$JAVA_FILE"
    exit 0
fi

javac \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
  -J--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED \
  -J--add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED \
  -J--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED \
  -XDaddTypeAnnotationsToSymbol=true \
  -XDcompilePolicy=simple \
  --should-stop=ifError=FLOW \
  -processorpath error_prone_core-2.47.0-with-dependencies.jar:dataflow-errorprone-3.41.0-eisop1.jar \
  "-Xplugin:ErrorProne -XepDisableAllChecks -Xep:UnnecessaryStaticImport:WARN -Xep:$CHECK:WARN" \
  $JAVA_FILE

