package com.liucw.resumeGenerator.entity;

public class Specialty {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kkb_specialty.id
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kkb_specialty.userid
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kkb_specialty.name
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kkb_specialty.description
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kkb_specialty.id
     *
     * @return the value of kkb_specialty.id
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kkb_specialty.id
     *
     * @param id the value for kkb_specialty.id
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kkb_specialty.userid
     *
     * @return the value of kkb_specialty.userid
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kkb_specialty.userid
     *
     * @param userid the value for kkb_specialty.userid
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kkb_specialty.name
     *
     * @return the value of kkb_specialty.name
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kkb_specialty.name
     *
     * @param name the value for kkb_specialty.name
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kkb_specialty.description
     *
     * @return the value of kkb_specialty.description
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kkb_specialty.description
     *
     * @param description the value for kkb_specialty.description
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Specialty(){};

    public Specialty(Integer id, Integer userid, String name, String description) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.description = description;
    }
}