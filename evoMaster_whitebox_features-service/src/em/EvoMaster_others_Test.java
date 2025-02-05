import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.evomaster.client.java.controller.api.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.evomaster.client.java.controller.db.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import  java.util.List;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import  org.evomaster.client.java.controller.expect.ExpectationHandler;
import  io.restassured.path.json.JsonPath;
import  java.util.Arrays;




/**
 * This file was automatically generated by EvoMaster on 2024-11-19T18:26:04.350+08:00[Asia/Shanghai]
 * <br>
 * The generated test suite contains 4 tests
 * <br>
 * Covered targets: 19
 * <br>
 * Used time: 0h 30m 1s
 * <br>
 * Needed budget for current results: 78%
 * <br>
 * This file contains test cases that represent failed calls, but not indicative of faults.
 */
public class EvoMaster_others_Test {

    
    private static final SutHandler controller = new em.embedded.org.javiermf.features.EmbeddedEvoMasterController();
    private static String baseUrlOfSut;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test
    public void test_0() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 10677L)
                .d("NAME", "\"QJX7e6rtmk12\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 10676L)
                .d("ID", "201")
            .and().insertInto("PRODUCT", 10675L)
                .d("NAME", "\"L9MuUZE7t1tGZ\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 10674L)
                .d("ID", "682")
            .and().insertInto("PRODUCT", 10673L)
                .d("NAME", "\"CKAL620cuSnD\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 10672L)
                .d("ID", "106")
            .and().insertInto("PRODUCT", 10671L)
                .d("NAME", "\"WlLUaBr7mG\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 10670L)
                .d("ID", "22")
            .and().insertInto("PRODUCT", 10669L)
                .d("NAME", "\"i2gT8wPxXnG\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 10668L)
                .d("ID", "159")
            .and().insertInto("PRODUCT", 10667L)
                .d("NAME", "\"pMRP5bBXK6W6\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 10666L)
                .d("ID", "244")
            .and().insertInto("PRODUCT", 10665L)
                .d("NAME", "\"x9VHu\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 10664L)
                .d("ID", "806871079")
            .and().insertInto("PRODUCT", 10663L)
                .d("NAME", "\"FsE_qEzF3df6lgBO\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 10662L)
                .d("ID", "952")
            .and().insertInto("PRODUCT", 10661L)
                .d("NAME", "\"L\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 10660L)
                .d("ID", "107")
            .and().insertInto("PRODUCT", 1701L)
                .d("NAME", "\"_EM_6101_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 1700L)
                .d("NAME", "\"_EM_877_XYZ_\"")
            .and().insertInto("PRODUCT", 1699L)
                .d("NAME", "\"F19PCfHkmLe5E9\"")
            .and().insertInto("FEATURE", 1698L)
                .d("NAME", "\"_EM_6102_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 1697L)
                .r("IN_CONFIGURATIONS_ID", 1700L)
                .r("ACTIVED_FEATURES_ID", 1698L)
            .and().insertInto("PRODUCT", 1696L)
                .d("NAME", "\"BGv\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 1695L)
                .d("NAME", "\"_EM_6103_XYZ_\"")
            .and().insertInto("PRODUCT", 1694L)
                .d("NAME", "\"\"")
            .and().insertInto("FEATURE", 1693L)
                .d("NAME", "\"444pPgH501Xgi6W\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 1692L)
                .r("IN_CONFIGURATIONS_ID", 1700L)
                .r("ACTIVED_FEATURES_ID", 1693L)
            .and().insertInto("PRODUCT", 1691L)
                .d("NAME", "\"6kNqD\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 1690L)
                .d("NAME", "\"Uo1U4T\"")
            .and().insertInto("PRODUCT", 1689L)
                .d("NAME", "\"_EM_6104_XYZ_\"")
            .and().insertInto("FEATURE", 1688L)
                .d("NAME", "\"wXPdU\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 1687L)
                .r("IN_CONFIGURATIONS_ID", 1695L)
                .r("ACTIVED_FEATURES_ID", 1698L)
            .and().insertInto("PRODUCT", 1686L)
                .d("NAME", "\"_EM_880_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 1685L)
                .d("NAME", "\"1\"")
            .and().insertInto("PRODUCT", 1684L)
                .d("NAME", "\"_EM_881_XYZ_\"")
            .and().insertInto("FEATURE", 1683L)
                .d("NAME", "\"GwNXSNxlfhX\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 1682L)
                .r("IN_CONFIGURATIONS_ID", 1685L)
                .r("ACTIVED_FEATURES_ID", 1683L)
            .and().insertInto("PRODUCT", 1681L)
                .d("NAME", "\"\"")
            .and().insertInto("FEATURE", 1680L)
                .d("NAME", "\"1Oa7rv\"")
                .r("PRODUCT_ID", 1681L)
            .and().insertInto("PRODUCT", 1679L)
                .d("NAME", "\"_EM_882_XYZ_\"")
            .and().insertInto("FEATURE", 1678L)
                .d("NAME", "\"tbiqy\"")
                .r("PRODUCT_ID", 1684L)
            .and().insertInto("PRODUCT", 1677L)
                .d("NAME", "\"kbyxl04Eho3tCKv\"")
            .and().insertInto("FEATURE", 1676L)
                .d("NAME", "\"_EM_6105_XYZ_\"")
                .r("PRODUCT_ID", 1701L)
            .and().insertInto("PRODUCT", 1675L)
                .d("NAME", "\"_EM_6106_XYZ_\"")
            .and().insertInto("FEATURE", 1674L)
                .d("NAME", "\"zLmzDQb_zJcYh7w1\"")
                .r("PRODUCT_ID", 10677L)
            .and().insertInto("PRODUCT", 1673L)
                .d("NAME", "\"vbaB\"")
            .and().insertInto("FEATURE", 1672L)
                .d("NAME", "\"_EM_6107_XYZ_\"")
                .d("PRODUCT_ID", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        String location_productName = "";
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/products")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(22))
                .body("", hasItems("QJX7e6rtmk12", "L9MuUZE7t1tGZ", "CKAL620cuSnD", "WlLUaBr7mG", "i2gT8wPxXnG", "pMRP5bBXK6W6", "x9VHu", "FsE_qEzF3df6lgBO", "L", "_EM_6101_XYZ_", "F19PCfHkmLe5E9", "BGv", "", "6kNqD", "_EM_6104_XYZ_", "_EM_880_XYZ_", "_EM_881_XYZ_", "", "_EM_882_XYZ_", "kbyxl04Eho3tCKv", "_EM_6106_XYZ_", "vbaB"));
        
        
        ValidatableResponse res_1 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/NvbQwXstqhCkJnl")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_1.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        given().accept("*/*")
                .delete(resolveLocation(location_productName, baseUrlOfSut + "/products/NvbQwXstqhCkJnl/constraints/813"))
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
        
        
        ValidatableResponse res_3 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/l9sEAiHNC_JAV2a")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_3.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        given().accept("*/*")
                .post(resolveLocation(location_productName, baseUrlOfSut + "/products/l9sEAiHNC_JAV2a/configurations/6k%5Cg"))
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
        
        given().accept("*/*")
                .delete(resolveLocation(location_productName, baseUrlOfSut + "/products/l9sEAiHNC_JAV2a/configurations/6k%5Cg"))
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
    }
    
    
    @Test
    public void test_1() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 2426L)
                .d("NAME", "\"_EM_5877_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 2425L)
                .d("NAME", "\"_EM_4093_XYZ_\"")
            .and().insertInto("PRODUCT", 2424L)
                .d("NAME", "\"_EM_2218_XYZ_\"")
            .and().insertInto("FEATURE", 2423L)
                .d("NAME", "\"_EM_5878_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 2422L)
                .r("IN_CONFIGURATIONS_ID", 2425L)
                .r("ACTIVED_FEATURES_ID", 2423L)
            .and().insertInto("PRODUCT", 2421L)
                .d("NAME", "\"_EM_4022_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 2420L)
                .d("NAME", "\"jgtja9AU4wd2e8a\"")
            .and().insertInto("PRODUCT", 2419L)
                .d("NAME", "\"_EM_2221_XYZ_\"")
            .and().insertInto("FEATURE", 2418L)
                .d("NAME", "\"_EM_4094_XYZ_\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 2417L)
                .r("IN_CONFIGURATIONS_ID", 2420L)
                .r("ACTIVED_FEATURES_ID", 2418L)
            .and().insertInto("PRODUCT", 2416L)
                .d("NAME", "\"CBeHVIg\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 2415L)
                .d("NAME", "\"_EM_4095_XYZ_\"")
            .and().insertInto("PRODUCT", 2414L)
                .d("NAME", "\"_EM_5879_XYZ_\"")
            .and().insertInto("FEATURE", 2413L)
                .d("NAME", "\"ut\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 2412L)
                .r("IN_CONFIGURATIONS_ID", 2420L)
                .r("ACTIVED_FEATURES_ID", 2413L)
            .and().insertInto("PRODUCT", 2411L)
                .d("NAME", "\"_EM_5880_XYZ_\"")
            .and().insertInto("FEATURE", 2410L)
                .d("NAME", "\"_EM_4096_XaZ_\"")
                .r("PRODUCT_ID", 2421L)
            .and().insertInto("PRODUCT", 2409L)
                .d("NAME", "\"_EM_4024_XYZ_Q\"")
            .and().insertInto("FEATURE", 2408L)
                .d("NAME", "\"_EM_2223_XYZ_\"")
                .r("PRODUCT_ID", 2409L)
            .and().insertInto("PRODUCT", 2407L)
                .d("NAME", "\"bZzDTMYTpMClxe\"")
            .and().insertInto("FEATURE", 2406L)
                .d("NAME", "\"_UM_2424_XYZ_\"")
                .r("PRODUCT_ID", 2409L)
            .and().insertInto("PRODUCT", 2405L)
                .d("NAME", "\"_EM_2225_XYZ_\"")
            .and().insertInto("FEATURE", 2404L)
                .d("NAME", "\"_EM_6226_XYZ_\"")
                .r("PRODUCT_ID", 2411L)
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        String location_productName = "";
        String location_configurationName = "";
        
        ValidatableResponse res_0 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/_EM_3215_YYJ")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_0.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("sourceFeature=72490&requiredFeature=0yDWlMdhqR")
                .post(resolveLocation(location_productName, baseUrlOfSut + "/products/8NIMeBGj2wta1_lk/constraints/requires"))
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        
        
        ValidatableResponse res_2 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/_EM_3215_YYJ")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_2.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("description=_EM_4017_XYZ_")
                .post(resolveLocation(location_productName, baseUrlOfSut + "/products/_EM_3215_YYJ/features/_EM_4092_%5CYZ_"))
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
        
        ValidatableResponse res_4 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/_EM_5876_XYZ_")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_4.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        given().accept("application/json")
                .get(resolveLocation(location_productName, baseUrlOfSut + "/products/_EM_5876_XYZ_/configurations"))
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
        
        
        ValidatableResponse res_6 = given().accept("*/*")
                .post(baseUrlOfSut + "/products/_EM_3215_YYJ")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_productName = res_6.extract().header("location");
        assertTrue(isValidURIorEmpty(location_productName));
        
        
        ValidatableResponse res_7 = given().accept("*/*")
                .post(resolveLocation(location_productName, baseUrlOfSut + "/products/_EM_3215_YYJ/configurations/OdY17"))
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
        location_configurationName = res_7.extract().header("location");
        assertTrue(isValidURIorEmpty(location_configurationName));
        
        
        given().accept("*/*")
                .post(resolveLocation(location_configurationName, baseUrlOfSut + "/products/_EM_3215_YYJ/configurations/_EM_4091_XYZ_/features/_EM_4092_%5CYZ_"))
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
        
        given().accept("*/*")
                .delete(resolveLocation(location_configurationName, baseUrlOfSut + "/products/_EM_3215_YYJ/configurations/_EM_4091_XYZ_/features/_EM_4092_%5CYZ_"))
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
    }
    
    
    @Test
    public void test_2() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 4386L)
                .d("NAME", "\"xHOWmST\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 4385L)
                .d("ID", "190")
            .and().insertInto("PRODUCT", 4384L)
                .d("NAME", "\"\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 4383L)
                .d("ID", "229")
            .and().insertInto("PRODUCT", 4382L)
                .d("NAME", "\"_EM_3554_XYZ_\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 4381L)
                .d("ID", "801")
            .and().insertInto("PRODUCT", 4380L)
                .d("NAME", "\"jdFzFaZrEq\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 4379L)
                .d("ID", "-1212788937")
            .and().insertInto("PRODUCT", 4378L)
                .d("NAME", "\"J0LOD57FD\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 4377L)
                .d("ID", "984")
            .and().insertInto("PRODUCT", 4376L)
                .d("NAME", "\"qv2aFee\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 4375L)
                .d("ID", "482")
            .and().insertInto("PRODUCT", 4374L)
                .d("NAME", "\"_EM_3555_XYZ_\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 4373L)
                .d("ID", "211")
            .and().insertInto("PRODUCT", 4372L)
                .d("NAME", "\"_EM_3556_XYZ_\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 4371L)
                .d("ID", "754")
            .and().insertInto("PRODUCT", 4370L)
                .d("NAME", "\"_WZzNHM3\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 4369L)
                .d("ID", "422")
            .and().insertInto("PRODUCT", 4368L)
                .d("NAME", "\"MB\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 4367L)
                .d("ID", "-7818573916821625125")
            .and().insertInto("PRODUCT", 861L)
                .d("NAME", "\"bs5boHNqXPVCJqL\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 860L)
                .d("NAME", "\"jttTrJ3\"")
            .and().insertInto("PRODUCT", 859L)
                .d("NAME", "\"GN3ceUg2v3ncFzeL\"")
            .and().insertInto("FEATURE", 858L)
                .d("NAME", "\"ziyDe0\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 857L)
                .r("IN_CONFIGURATIONS_ID", 860L)
                .r("ACTIVED_FEATURES_ID", 858L)
            .and().insertInto("PRODUCT", 856L)
                .d("NAME", "\"GsWk3\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 855L)
                .d("NAME", "\"kz21_c4MWq2JaL5\"")
            .and().insertInto("PRODUCT", 854L)
                .d("NAME", "\"_EM_3557_XYZ_\"")
            .and().insertInto("FEATURE", 853L)
                .d("NAME", "\"9cOQuzJqZTad\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 852L)
                .r("IN_CONFIGURATIONS_ID", 855L)
                .r("ACTIVED_FEATURES_ID", 858L)
            .and().insertInto("PRODUCT", 851L)
                .d("NAME", "\"ny\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 850L)
                .d("NAME", "\"_EM_3558_XYZ_\"")
            .and().insertInto("PRODUCT", 849L)
                .d("NAME", "\"_EM_3559_XYZ_\"")
            .and().insertInto("FEATURE", 848L)
                .d("NAME", "\"IdeKii5L\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 847L)
                .r("IN_CONFIGURATIONS_ID", 850L)
                .r("ACTIVED_FEATURES_ID", 853L)
            .and().insertInto("PRODUCT", 846L)
                .d("NAME", "\"UWmKbNi6akbkR6rE\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 845L)
                .d("NAME", "\"rIgga\"")
            .and().insertInto("PRODUCT", 844L)
                .d("NAME", "\"fVo_deMbF\"")
            .and().insertInto("FEATURE", 843L)
                .d("NAME", "\"q5TCRbCivUOop3\"")
            .and().insertInto("PRODUCT_CONFIGURATION_ACTIVED_FEATURES", 842L)
                .r("IN_CONFIGURATIONS_ID", 855L)
                .r("ACTIVED_FEATURES_ID", 843L)
            .and().insertInto("PRODUCT", 841L)
                .d("NAME", "\"_EM_3560_XYZ_\"")
            .and().insertInto("FEATURE", 840L)
                .d("NAME", "\"KzEzJqn0573\"")
                .r("PRODUCT_ID", 841L)
            .and().insertInto("PRODUCT", 839L)
                .d("NAME", "\"m\"")
            .and().insertInto("FEATURE", 838L)
                .d("NAME", "\"bbtY\"")
                .r("PRODUCT_ID", 839L)
            .and().insertInto("PRODUCT", 837L)
                .d("NAME", "\"\"")
            .and().insertInto("FEATURE", 836L)
                .d("NAME", "\"7Mw\"")
                .r("PRODUCT_ID", 837L)
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        
        given().accept("*/*")
                .post(baseUrlOfSut + "/products/Ja%5C_35L1_hYZX")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
        
    }
    
    
    @Test
    public void test_3() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 12L)
                .d("NAME", "\"F\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 11L)
                .d("ID", "-16776642")
            .and().insertInto("PRODUCT", 10L)
                .d("NAME", "\"_EM_2_XYZ_\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 9L)
                .d("ID", "589")
            .and().insertInto("PRODUCT", 8L)
                .d("NAME", "\"_EM_3_XYZ_\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 7L)
                .d("ID", "546")
            .and().insertInto("PRODUCT", 6L)
                .d("NAME", "\"a\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 5L)
                .d("ID", "234")
            .and().insertInto("PRODUCT", 4L)
                .d("NAME", "\"_EM_4_XYZ_\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 3L)
                .d("ID", "884")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/;U/constraints/0")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("text/html");
        
    }


}
