package service;

import model.Group;

public class GroupCreator {
    public static final String TESTDATA_DESTINATION = "testdata.group.destination";
    public static final String TESTDATA_DEFAULT_NUMBER_OF_ADULTS = "testdata.group.adults.default";
    public static final String TESTDATA_NUMBER_OF_ADULTS = "testdata.group.adults";
    public static final String TESTDATA_MAX_NUMBER_OF_ADULTS = "testdata.group.adults.max";

    public static Group groupFromProperty() {
        return new Group(TestDataReader.getTestData(TESTDATA_DESTINATION),
                         TestDataReader.getTestData(TESTDATA_DEFAULT_NUMBER_OF_ADULTS),
                         TestDataReader.getTestData(TESTDATA_NUMBER_OF_ADULTS),
                         TestDataReader.getTestData(TESTDATA_MAX_NUMBER_OF_ADULTS));
    }
}
