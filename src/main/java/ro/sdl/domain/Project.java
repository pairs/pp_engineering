package ro.sdl.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {

    public Project() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String description;
    
    @OneToMany(mappedBy="project")
//    @JoinColumn(name="id")
    private List<User> users = new ArrayList<User>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Project(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Project(Integer id, String description, List<User> users) {
        this(id,description);
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;

        Project project = (Project) o;

        if (description != null ? !description.equals(project.description) : project.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }
}
