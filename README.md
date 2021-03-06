# snake-pit-ui

snake-pit-ui is a project written in Java and Swing that serves as a GUI for both [snake-pit](https://github.com/somi92/snake-pit) and [clojure-snake](https://github.com/somi92/clojure-snake) projects. 

[snake-pit](https://github.com/somi92/snake-pit) is a student project written in Clojure to demonstrate application of genetic programming to the snake game. The goal of the project is to evolve the snake game AI.

[clojure-snake](https://github.com/somi92/clojure-snake) is a simple implementation of the snake game written in Clojure and Swing. It also has the ability to use the AI output of the snake-pit project.

This project presents a convenient interface that enables the user to experiment with GP parameters and evolve the AI, run and display the AI in action, as well as starting manual play of the game.

## Installation and usage

You must have Java installed on your machine. Download the SnakePitUI.zip file that can be found in the releases section of this respository and unpack it on your machine. Enter the SnakePitUI folder and run the following command from command line:

```
java -jar SnakePitUI.jar
```

The lib folder contains the snake-pit and clojure-snake projects and you shoudn't relocate it.

## Options

![Snake pit menu](https://raw.githubusercontent.com/somi92/snake-pit-ui/master/img/menu.png?raw=true "Snake pit menu")

Manual play
  - Starts the clojure-snake in manual mode with the ability to set the speed of the game.
  
  ![Playing](https://raw.githubusercontent.com/somi92/snake-pit-ui/master/img/snake2.png?raw=true "Playing")

Load and run snake AI
  - Presents an interface for loading the AI (control routine) produced by snake-pit and calls the clojure-snake to display the AI in action. Use ctrl-V to paste the control routine or enter it manually. The user can also load a hardcoded demo AI with a click of a button. To see how a valid control routine looks like please refer to documentation of the [snake-pit](https://github.com/somi92/snake-pit) project.
  
  ![Load snake AI](https://raw.githubusercontent.com/somi92/snake-pit-ui/master/img/loadai.png?raw=true "Load snake AI")

Breed snakes
  - Presents an interface for working with snake-pit library. The user can set GP parameters and run the GP engine. The GP reports back the result and the status of the run. Results can be saved to a text file along with the parameters of the associated run. For description of the available GP parameters please refer to documentation of the [snake-pit](https://github.com/somi92/snake-pit) project.
  
  ![Breed snake](https://raw.githubusercontent.com/somi92/snake-pit-ui/master/img/gp.png?raw=true "Breed snake")

About
  - Presents information about the project.

## Contact

If you have some comments, suggestions or noticed some bugs and problems feel free to contact me and contribute.

Developed by Milos Stojanovic 

email: stojanovicmilos31@gmail.com

## License

Copyright © 2015

Distributed under the Eclipse Public License. The copy of the license is available in the repository.
