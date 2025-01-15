# `cat-server`

![Banner](res/banner.png)

`cat-server` is a Java tool, based on [CAT](https://github.com/IdrissRio/cat/), that constructs call graphs based on Class Hierarchy Analaysis and a variant of Rapid Type Analysis. It uses JastAdd and reference attribute grammars for its implementation. `cat-server` acts as a back-end for [`cat-viz`](https://github.com/trettiofem/cat-viz), an extension for Visual Studio Code, which displays call graphs right in the editor.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [License](#license)

## Features

- **Call Graph Generation**: CAT generates call graphs for Java programs using Class Hierarchy Analysis techniques.

## Usage

After building (`./gradlew jar`), start the server by running `java -jar cat.jar`. The server is now up and running, and ready to accept incoming requests for call graph analysis.

## License
`cat-server` is released under the BSD 2-Clause License.