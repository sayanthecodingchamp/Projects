package com.springboot.suntelglobalinternships.Model;

public class Internship {
    private String internshipId;
    private String internshipPosition;
    private String aboutTheInternship;
    private String postedOn;
    private String techStack;
    private String startDate;
    private String duration;
    private String stipend;
    private String location;
    private String  workType;
    private String noOfOpenings;
    private String totalNoOfApplicants;
    private String applyBy;
    private String perks;
    private String website;

    public Internship() {
    }

    public Internship(String internshipId) {
        this.internshipId = internshipId;
    }

    public Internship(String internshipId, String internshipPosition, String aboutTheInternship, String postedOn, String techStack, String startDate, String duration, String stipend, String location, String workType, String noOfOpenings, String totalNoOfApplicants, String applyBy, String perks, String website) {
        this.internshipId = internshipId;
        this.internshipPosition = internshipPosition;
        this.aboutTheInternship = aboutTheInternship;
        this.postedOn = postedOn;
        this.techStack = techStack;
        this.startDate = startDate;
        this.duration = duration;
        this.stipend = stipend;
        this.location = location;
        this.workType = workType;
        this.noOfOpenings = noOfOpenings;
        this.totalNoOfApplicants = totalNoOfApplicants;
        this.applyBy = applyBy;
        this.perks = perks;
        this.website = website;
    }

    public String getInternshipId() {
        return internshipId;
    }

    public void setInternshipId(String internshipId) {
        this.internshipId = internshipId;
    }

    public String getInternshipPosition() {
        return internshipPosition;
    }

    public void setInternshipPosition(String internshipPosition) {
        this.internshipPosition = internshipPosition;
    }

    public String getAboutTheInternship() {
        return aboutTheInternship;
    }

    public void setAboutTheInternship(String aboutTheInternship) {
        this.aboutTheInternship = aboutTheInternship;
    }

    public String getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStipend() {
        return stipend;
    }

    public void setStipend(String stipend) {
        this.stipend = stipend;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getNoOfOpenings() {
        return noOfOpenings;
    }

    public void setNoOfOpenings(String noOfOpenings) {
        this.noOfOpenings = noOfOpenings;
    }

    public String getTotalNoOfApplicants() {
        return totalNoOfApplicants;
    }

    public void setTotalNoOfApplicants(String totalNoOfApplicants) {
        this.totalNoOfApplicants = totalNoOfApplicants;
    }

    public String getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy;
    }

    public String getPerks() {
        return perks;
    }

    public void setPerks(String perks) {
        this.perks = perks;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Internship{" +
                "internshipId='" + internshipId + '\'' +
                ", internshipPosition='" + internshipPosition + '\'' +
                ", aboutTheInternship='" + aboutTheInternship + '\'' +
                ", postedOn='" + postedOn + '\'' +
                ", techStack='" + techStack + '\'' +
                ", startDate='" + startDate + '\'' +
                ", duration='" + duration + '\'' +
                ", stipend='" + stipend + '\'' +
                ", location='" + location + '\'' +
                ", workType='" + workType + '\'' +
                ", noOfOpenings='" + noOfOpenings + '\'' +
                ", totalNoOfApplicants='" + totalNoOfApplicants + '\'' +
                ", applyBy='" + applyBy + '\'' +
                ", perks='" + perks + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
