package isdc.isdcssm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "`cms_file`")
public class File {
    @Id
    @Column(name = "`id`")
    @JsonIgnore
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`href`")
    private String href;

    @Column(name = "`name`")
    private String name;

    @JsonIgnore
    @Column(name = "`course_id`")
    private Integer courseId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return course_id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}