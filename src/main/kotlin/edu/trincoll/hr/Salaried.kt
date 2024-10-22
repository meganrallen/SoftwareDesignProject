package edu.trincoll.hr

// Salaried class should extend the Employee class. That means
// its constructor should take a name of type String and an id of type Int,
// and pass them to the Employee constructor.
//
// It also should have:
//   - an annual "salary" field of type Double
//
// It should override the pay() method to return the salary divided by 26.0.
//
// It should override the toString method to return a string with the
// name, id, and salary of the employee.

// Salaried class extends Employee
class Salaried(
    name: String,
    id: Int,
    val salary: Double
) : Employee(name, id) {

    // Override pay method to return salary / 26 (bi-weekly pay)
    override fun pay(): Double {
        return salary / 26.0
    }

    // Override toString method to include name, id, and salary
    override fun toString(): String {
        return "Name: $name, ID: $id, Salary: $salary"
    }
}
