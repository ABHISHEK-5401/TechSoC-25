# CaesarCiphar Test Cases

Below is the matrix of test cases to verify encoding and decoding behavior.

| ID    | Input String          | Shift Value | Expected Output        | Description                                              |
|-------|-----------------------|-------------|------------------------|----------------------------------------------------------|
| TC1   | ""                    | 0           | ""                     | Empty string with zero shift                             |
| TC2   | "abc"                 | 3           | "def"                  | Basic lowercase shift                                    |
| TC3   | "xyz"                 | 3           | "abc"                  | Lowercase wrap-around                                    |
| TC4   | "ABC"                 | -3          | "XYZ"                  | Uppercase negative shift with wrap-around                |
| TC5   | "Hello, World!"       | 5           | "Mjqqt, Btwqi!"        | Mixed letters and punctuation                            |
| TC6   | "Attack at dawn!"     | 26          | "Attack at dawn!"      | Full-cycle shift that leaves text unchanged              |
| TC7   | "Attack at dawn!"     | -52         | "Attack at dawn!"      | Double full-cycle negative shift                         |
| TC8   | "Mixed CASE"          | 2           | "Okzgf ECUG"           | Mixed-case string shift                                  |
| TC9   | "WrapAround zZ"       | 1           | "XsbqBsvoe aA"         | Wrap-around behavior for both lowercase and uppercase    |
| TC10  | "LargeShift"          | 29          | "OdudjhVklwi"          | Shift >26 normalized to 3                                |
| TC11  | "NegativeLargeShift"  | -29         | "KyqdxbshWxfdqeb"      | Shift <-26 normalized to -3                              |
| TC12  | "NonLetters 1234!@#"  | 7           | "UvualYpar 1234!@#"    | Non-alphabetic characters remain unchanged               |

