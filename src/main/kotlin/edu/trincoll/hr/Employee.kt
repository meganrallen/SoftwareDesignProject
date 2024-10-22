package edu.trincoll.hr

// Abstract class Employee should have:
//   - a name of type String
//   - an id of type Int.
// It should implement the Comparable interface with the
// compareTo method.
//
// It should include an abstract method pay()
// that returns a Double.
//
// It should override the toString method to
// return a string with the name and id of the employee.

// Abstract class Employee
abstract class Employee(
    val name: String,
    val id: Int
) : Comparable<Employee> {

    // Abstract method to be implemented by subclasses
    abstract fun pay(): Double

    // Implement the compareTo method for Comparable interface
    override fun compareTo(other: Employee): Int {
        val payComparison = this.pay().compareTo(other.pay())
        if (payComparison != 0) {
            return payComparison
        }
        val nameComparison = this.name.compareTo(other.name)
        if (nameComparison != 0) {
            return nameComparison
        }
        return this.id.compareTo(other.id)
    }

    // Override toString to return name and id
    override fun toString(): String {
        return "Name: $name, ID: $id"
    }
}