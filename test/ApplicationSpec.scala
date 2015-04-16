import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.test._
import play.api.test.Helpers._
import models.User
import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.test._
import play.api.test.Helpers._
import controllers.ApplicationTrait
import play.mvc.Controller
import scala.concurrent.Future
import org.specs2.mock.Mockito
import java.util.Date
import play.api.mvc._
import play.api.test._
import scala.concurrent.Future
import controllers.ApplicationTrait

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification with Mockito {

  val mUserDao = mock[User]
  //Controller object override
  object Test extends ApplicationTrait {
    val user: User = mUserDao
  }

  //Test are being started here
  
  "Testing mocked models" should {
    "testing access" in new WithApplication {
      
      mUserDao.calculate(5) returns 11
      val result = Test.calsquare().apply(FakeRequest())
      val bodyText: String = contentAsString(result)
      bodyText must contain("11")
    }
  }
  

  "Application" should {

    "send 404 on a bad request" in new WithApplication {
      route(FakeRequest(GET, "/boum")) must beNone
    }

    "render the index page" in new WithApplication {
      val home = route(FakeRequest(GET, "/")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain("Employee Management")
    }
  }
  
  
}
