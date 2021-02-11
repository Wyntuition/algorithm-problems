# alorithm-problems project

A place to do algorithm problems, running them all from a `/hello` endpoint. Most are done in the `MiscAlgorithms` class.   

It uses Quarkus, the Supersonic Subatomic Java Framework. If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

1. Run your application in dev mode that enables live coding using:
    ```
    ./gradlew quarkusDev
    ```
1. Run the algorithms wired in on the `GreetingReousece` controller, by visiting the url outputting when running the above command, plus `/hello` 

## Extra fun with Quarkus

## Packaging and running the application

The application can be packaged using `./gradlew quarkusBuild`.
It produces the `quarkus-getting-started-1.0.0-SNAPSHOT-runner.jar` file in the `build` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/lib` directory.

The application is now runnable using `java -jar build/quarkus-getting-started-1.0.0-SNAPSHOT-runner.jar`.

If you want to build an _über-jar_, just add the `--uber-jar` option to the command line:
```
./gradlew quarkusBuild --uber-jar
```

## Creating a native executable

You can create a native executable using: `./gradlew build -Dquarkus.package.type=native`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./build/quarkus-getting-started-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling#building-a-native-executable.