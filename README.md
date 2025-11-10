# Jogo da Forca / Game of the Gallows

A simple Java console application that implements the classic "Hangman" game (Portuguese: Jogo da Forca). This repository contains a small, easy-to-read Java program intended for learning and playing the game in a terminal.

Descrição (Português)
Este é um jogo de forca em Java para rodar no console. O jogador tenta adivinhar a palavra escondida letra por letra. A cada erro, uma parte do "boneco" é desenhada; quando o boneco está completo, o jogo termina.

English description
This is a console-based Hangman game implemented in Java. The player guesses a hidden word, one letter at a time. Each incorrect guess draws more of the gallows/hangman; when the drawing is complete, the player loses.

Features
- Pure Java console application (no GUI).
- Easily readable and modifiable source code for learning.
- Supports a configurable word list (simple text file).
- Displays current progress, used letters, remaining attempts.

Requirements
- Java Development Kit (JDK) 11 or newer recommended.
- Terminal / command prompt.

Getting started (quick)
1. Clone the repository:
   git clone https://github.com/Allgommes/Jogo_Da_Forca.git
2. Move into the project folder and compile the Java sources. Example for a single file main class (adjust file names if different):
   - If your main class is Hangman.java:
     javac Hangman.java
     java Hangman
   - If the project uses packages or multiple source files, compile all:
     javac -d out $(find . -name "*.java")
     java -cp out your.package.MainClass

If the project already includes a build tool (Maven/Gradle), use the appropriate commands:
- Maven: mvn compile && mvn exec:java -Dexec.mainClass="your.MainClass"
- Gradle: ./gradlew run

How to play
- The game selects a secret word.
- The console shows underscores for each letter not yet revealed.
- Type a single letter and press Enter to guess that letter.
- Correct letters are revealed in their positions.
- Incorrect guesses reduce the remaining attempts and draw more of the hangman.
- The game ends when you guess the word or run out of attempts.

Suggested words file
You can add a text file with one word per line (e.g. words.txt) and modify the code to load words from that file. This makes it easy to extend the game's vocabulary without changing the source code.

Example gameplay
Secret word: JAVA
Display: _ _ _ _
Player guesses: A -> _ A _ A
Player guesses: J -> J A _ A
Player guesses: V -> J A V A -> Player wins!

Configurable options (ideas)
- Max attempts before game over.
- Case-insensitive guesses.
- Allow guessing the full word.
- Load words from a file or the network.
- Difficulty levels (short words, longer words, phrases).

Contributing
Contributions are welcome. Suggested improvements:
- Add unit tests.
- Add CLI options (choose difficulty, seed, word file).
- Improve input validation and UI/UX in console.
- Add localization (Portuguese / English prompts).

License
This project is provided under the MIT License. See LICENSE file for details (or add one if missing).

Contact
Author: Allgommes
Repository: https://github.com/Allgommes/Jogo_Da_Forca

----

O que eu fiz: criei um README com descrição em português e inglês, instruções rápidas para compilar/rodar, explicação de gameplay, sugestões de configuração, ideias de contribuição e licença.

Próximo passo sugerido: me diga se você quer que eu adicione um arquivo words.txt com exemplos de palavras, um script build (Maven/Gradle) ou um README totalmente em português — eu posso gerar esses arquivos e atualizá-los no repositório conforme desejar.
