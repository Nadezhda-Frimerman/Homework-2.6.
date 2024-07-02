package proskyemployee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class Employee {

        private String firstName;
        private String lastname;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastname = lastName;
        }

        public String getLastname() {
            return lastname;
        }

        public String getFirstName() {
            return firstName;
        }

        public int hashCode() {
            return Objects.hash(firstName, lastname);
        }

        public boolean equals(Object a) {
            if (this == a) return true;
            if (a == null || getClass() != a.getClass()) return false;
            Employee employee = (Employee) a;
            return Objects.equals(firstName, employee.firstName) &&
                    Objects.equals(lastname, employee.lastname);
        }
        public String toString() {
            return String.format("%s %s",
                    firstName, lastname);
        }

    }

