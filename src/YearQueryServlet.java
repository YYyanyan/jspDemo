import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class YearQueryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        /* 从模型获取答案*/
        String year = req.getParameter("year");  //从请求的信息（表单）内，找到name属性为year的表单，并获取用户提交的结果
        Concert concert = new Concert();
        List ans = concert.getConcertList(year);

        /* 将模型组件的贵大增加到请求对象 */
        req.setAttribute("styles", ans);  //为请求对象增加一个属性,其值为ans，供给jsp使用
        RequestDispatcher view = req.getRequestDispatcher("YearQuery.jsp"); //为jsp实例化一个请求分派器
        view.forward(req, resp); //使用请求分派器要求容器准备好jsp，并向jsp发送请求和响应
    }
}
