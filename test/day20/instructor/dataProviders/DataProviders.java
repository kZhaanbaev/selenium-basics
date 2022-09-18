package day20.instructor.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "viewOptions")
    public Object[] data(){
        Object[] viewOptions = {
                "10",
                "25",
                "50",
                "All"
        };
        return viewOptions;
    }

    @DataProvider(name = "userData")
    public Object[][] userData(){
        Object[][] users = new Object[3][5];
        users[0][0] = "Sam";
        users[0][1] = "Fly";
        users[0][2] = "222-222-2222";
        users[0][3] = "sam.f@test.com";
        users[0][4] = "Student";

        users[1][0] = "John";
        users[1][1] = "Smith";
        users[1][2] = "111-222-2222";
        users[1][3] = "john.f@test.com";
        users[1][4] = "Mentor";

        users[2][0] = "Olivia";
        users[2][1] = "Adams";
        users[2][2] = "333-222-2222";
        users[2][3] = "olivia.f@test.com";
        users[2][4] = "Instructor";

        return users;
    }
}
