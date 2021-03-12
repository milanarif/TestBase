###Exercises in Java and Unit Testing

* Start with writing test for Triangle.java.
  It has 3 public methods that can answer the question of how many sides are equal in the triangle.
  Scalene, Isosceles, Equilateral
  Write tests that gives us 100% code coverage and fix any errors you find in the code.
  
* Write unit tests for Roman Numeral. Here we need to write more tests than to get just code coverage.
  Use **Parameterized Tests** when you need to test alot of similar calls.
  [https://www.arhohuttunen.com/junit-5-parameterized-tests/]
  
  We can't test every possible input so we need to choose good test cases.
  
  As an extra exercise, try to write a method going from decimal number to roman numeral string.
  Add test methods to verify output.
  
* TDD greeter. Exercis to train **TDD**, start with writing a test then implement the code.
  The exercise uses Date and Time so to be able to write tests we must controll the time.
  
* Another TDD example is fizzbuzz for more training.

* Invoice is an example of code that isn't testable as it is now. We need to use Dependency Injection
  so we can test Invoice Filter using Test Doubles. The class InvoiceView prints information to
  the console so special code is needed to handle that. Don't be afraid of refactoring the code so it 
  gets more testable.
  
  Should we test methods in Invoice.java?
  [https://stackoverflow.com/questions/42929246/should-i-unit-test-hashcode-equals-tostring]
  
  [https://jqno.nl/equalsverifier/]

