import io.restassured.RestAssured;//
import io.restassured.response.Response;//
import org.junit.jupiter.api.Test;

public class helloWorldTest {
    @Test
    public void testHelloWorld(){
    Response response = RestAssured
            .get("https://playground.learnqa.ru/api/get_text")//Гет запрос на адрес
            .andReturn();//вернуть результат в переменную response
    response.prettyPrint();//вывести полученый json
}
}
