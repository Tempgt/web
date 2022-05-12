import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author RMDSTIC
 */
@WebService(serviceName = "assigment")
@Stateless()
public class assigment {

    /**
     * This is a sample web service operation
     */
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public Integer add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c;
        c= a+b;
        return c;
    }
}
