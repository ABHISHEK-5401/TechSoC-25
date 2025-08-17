--->>Introduction<<----
Hello I am AbhishekVerma from the Engineering Physics department, BTech 1st year. Below is a breakdown of how the CaesarCiphar class works, step by step.

---<<Class Structure>>---
- The class is named CaesarCiphar.
- It contains two main parts:
- A static method shift that performs the core cipher logic.
- A main method that handles user interaction and calls shift.


---<<The Shift Method>>---
This method takes two parameters:
- str: the input string to encode or decode.
- n: the number of positions to shift (positive for encoding, negative for decoding).
Key steps inside shift:
- Zero-shift handling
- If n == 0, the original string is returned immediately.
- Normalizing the shift value
- Reduces n to a value within -26 to 26 by repeatedly subtracting or adding 26.
- This ensures wrapping behavior stays within one full alphabet cycle.
- Character-by-character processing
- For each character curr in the input:
- If it is a letter (Character.isLetter(curr)):
- Compute a provisional new character code charnum = curr + n.
- Check if charnum still falls within uppercase (65–90) or lowercase (97–122) ranges.
- If it falls outside, wrap it:
- Uppercase wrap: add or subtract 26 to stay within A–Z.
- Lowercase wrap: add or subtract 26 to stay within a–z.
- Append the final character to the result.
- If it is not a letter, append it unchanged.
- Return
- A StringBuilder containing the shifted text.


---<<The Main Method>>---
This method manages user input and output:
- Prompt for operation
- Displays “Press 1 to Code and 2 to Decode”
- Reads an integer op.
- Branch on op
- If op == 1, it treats the input as plaintext to encode.
- If op == 2, it treats the input as ciphertext to decode (by calling shift with -n).
- Otherwise, prints “Invalid Operator”.
- Input collection
- Reads the string to process.
- Reads the shift value n.
- Processing and output
- Calls shift(str, n) (or shift(str, -n) for decoding).
- Prints the resulting shifted string.
- Cleanup
- Closes the Scanner.


