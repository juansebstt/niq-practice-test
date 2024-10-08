# NIQ - Label Insight Backend Code Test

## Overview

This repository contains my solutions for the Label Insight Backend Code Test, which consists of two problems:

1. **Missing Letters**: A method to identify missing letters in a given sentence, determining if it is a pangram.
2. **Animation**: A method to simulate the movement of particles in a linear chamber based on their initial conditions and speed.

## Technologies Used

- Java 17
- Maven for dependency management

## Instructions to Run

To execute the code, follow these steps:

1. **Clone the Repository**:

# Label Insight Backend Code Test

## Overview

This repository contains my solutions for the Label Insight Backend Code Test, which consists of two problems:

1. **Missing Letters**: A method to identify missing letters in a given sentence, determining if it is a pangram.
2. **Animation**: A method to simulate the movement of particles in a linear chamber based on their initial conditions and speed.

## Technologies Used

- Java 17
- Maven for dependency management

## Instructions to Run

To execute the code, follow these steps:

1. **Clone the Repository**:

    ```
    git clone <https://github.com/juansebstt/niq-practice-test>
    cd NIQ-test
    
    ```

2. **Build the Project**:
   Ensure you have Maven installed. Run the following command to build the project:

    ```
    mvn clean install
    ```

3. **Run the Missing Letters Program**:
   Navigate to the `MissingLetters` class and run it. The program will prompt you to enter a sentence. Type your input and press Enter. To exit, type `exit`.
4. **Run the Animation Program**:
   Navigate to the `Animation` class and run it. The program will prompt you to enter the speed and the initial state of the particles. Type your input and press Enter. To exit, type `exit`.

### Example Usage

### For Missing Letters:

```
Please enter a sentence (or type 'exit' to quit):
A slow yellow fox crawls under the proactive dog
Missing letters: bjkmqz
```

### For Animation:

```
Enter speed (or type 'exit' to quit):
2
Enter the initial particle state:
..R....
Animation result:
..X....
....X..
......X
.......
```

## Assumptions

- For the **Missing Letters** method, non-alphabet characters and case sensitivity are ignored.
- For the **Animation** method, particles can pass through each other without affecting their movement.

## Conclusion

This implementation aims to showcase my understanding of Java programming, algorithm design, and efficiency considerations for both problems. Thank you for reviewing my code!