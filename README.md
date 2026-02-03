# Roman-Numeral-Converter

A recursive implementation for converting between decimal integers and Roman Numerals. 

##  Features
- **Decimal to Roman:** Converts integers (1-3999) into standard Roman strings.
- **Roman to Decimal:** Parses Roman strings back into integer values.
- **Recursive Logic:** Breaks down string manipulation into recursive base cases.
- **User Interface:** Simple CLI using `java.util.Scanner` for real-time interaction.

## Technical Implementation
The project focuses on Recursion over iteration:
- **`toRoman(int)`**: Evaluates the largest possible Roman character, appends it, and calls itself with the remaining value until the base case (`num <= 0`) is reached.
- **`toNum(String)`**: Processes the string head, maps it to its integer value via a `switch` statement, and recursively sums the tail of the string.

## How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/jadarodg/Roman-Numeral-Converter.git](https://github.com/jadarodg/Roman-Numeral-Converter.git)

2. Navigate to the source folder and compile:
     javac src/converter/RomanConverter.java

3. Run the application:
      java src/converter/RomanConverter
