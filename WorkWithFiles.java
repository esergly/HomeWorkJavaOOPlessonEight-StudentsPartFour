public interface WorkWithFiles {

    public void saveGroupToFile(Group group);

    public Group loadGroupFromFile();

    public void saveGroupToFileSerialization(Group group);

    public Group loadGroupFromFileDeserialization();

}

