public class Company {
    public static void main(String[] args) {
        Employee katarzyna = new Employee();
        katarzyna.firstName = "Katarzyna";
        katarzyna.lastName = "Nowak";
        katarzyna.birthYear = 1992;
        katarzyna.workYer = 4;

        Employee janusz = new Employee();
        janusz.firstName = "Janusz";
        janusz.lastName = "Kowalski";
        janusz.birthYear = 1975;
        janusz.workYer = 22;

        Employee maria = new Employee();
        maria.firstName = "Maria";
        maria.lastName = "Malinowska";
        maria.birthYear = 1987;
        maria.workYer = 16;

        String employeeInfo = "Imię: " + katarzyna.firstName + ", Nazwisko: " + katarzyna.lastName
                + ", rok urodzenia: " + katarzyna.birthYear + ",staż pracy w latach: " + katarzyna.workYer;
        System.out.println(employeeInfo);
    }

}
