class Biydaalt32 {
    public static void main(String[] args) {
        Person[] familyMembers = new Person[3];

        // Create 3 persons of the same family and occupation
        familyMembers[0] = new Person("Temuujin", 5000, 1000);
        familyMembers[1] = new Person("Chinzorig", 6000, 1500);
        familyMembers[2] = new Person("Purevbaatar", 4000, 1200);

        for (Person member : familyMembers) {
            // Salary calculation for each household member
            member.calculateSalaryAfterTax();

            // Each family member makes 1-2 payments and their calculations
            double payment1 = 500;
            double payment2 = 700;
            member.addToFamilyExpenses(payment1);
            member.addToFamilyExpenses(payment2);

            // Display income, expenses, and their difference for each household member
            member.displayIncomeAndExpenses();
        }

        // Profitable income and salary for the family
        double totalIncome = 0;
        double totalExpenses = 0;

        for (Person member : familyMembers) {
            totalIncome += member.salaryAfterTax;
            totalExpenses += member.cost;
        }

        Person.familyIncome = totalIncome;
        Person.familyExpenses = totalExpenses;

        // Total family income and expenses
        System.out.println("Total Family Income: " + Person.getTotalFamilyIncome());
        System.out.println("Total Family Expenses: " + Person.getTotalFamilyExpenses());

        // Print the name of the member with the maximum cost
        String maxCostMember = Person.findMaxCostMember(familyMembers);
        System.out.println("Member with Maximum Cost: " + maxCostMember);
    }
}