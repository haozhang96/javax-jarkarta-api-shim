# javax-jakarta-api-shim
A shim that helps bridge code using javax APIs to jakarta APIs

## Goals
The main goal of this repository is to help bridge pre-compiled code using the javax APIs to their respective jakarta
APIs simply by dropping a JAR file on the class-path at runtime. These shims are not designed to be used for active
development using javax APIs, as some of the methods used for the shims require bypassing compile-time generic type
checks and depend on runtime type erasure.
