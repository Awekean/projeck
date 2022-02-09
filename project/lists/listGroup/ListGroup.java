package project.lists.listGroup;

import project.model.Group;

import java.util.ArrayList;
import java.util.List;

public class ListGroup {

    private List<Group> listGroup;

    public ListGroup() {
        this.listGroup = new ArrayList<>();
    }

    public List<Group> getListGroup() {
        return listGroup;
    }
}
