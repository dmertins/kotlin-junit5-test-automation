import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatabaseTest {

    @BeforeAll fun createDatabase() {
        println("[@BeforeAll] Creating database...")
    }

    @BeforeEach fun connectToDatabase() {
        println("[@BeforeEach] Connecting to database...")
    }

    @BeforeEach fun insertDataIntoDatabase() {
        println("[@BeforeEach] Inserting data into database...")
    }

    @Test fun testDatabaseFunctionality() {
        println("[@Test] Testing database functionality...")
    }

    @AfterEach fun deleteDataFromDatabase() {
        println("[@AfterEach] Deleting data from database...")
    }

    @AfterEach fun disconnectFromDatabase() {
        println("[@AfterEach] Disconnecting from database...")
    }

    @AfterAll fun destroyDatabase() {
        println("[@AfterAll] Deleting database...")
    }
}
