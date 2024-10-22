package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees

class HR(private val employees: List<Employee> = emptyList()) {

    // Method to hire a new employee, returns a new HR instance with the employee added
    fun hire(employee: Employee): HR {
        return HR(employees + employee) // Adds employee to the list
    }

    // Method to fire an employee by id, returns a new HR instance with the employee removed
    fun fire(id: Int): HR {
        return HR(employees.filter { it.id != id }) // Filters out the employee with the given id
    }

    // Method to calculate total pay for all employees
    fun payEmployees(): Double {
        return employees.sumOf { it.pay() } // Sums the pay of all employees
    }

    // Override toString to list all employees
    override fun toString(): String {
        return employees.joinToString(separator = "\n") { it.toString() }
    }
}
