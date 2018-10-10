package com.quiz.krishna.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Quiz")
@NamedQuery(query = "select q from Quiz q", name="query_get_all_questions")
public class Quiz implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="question", nullable = false)
    private String question;

    @Column(name="opt1", nullable = false)
    private String opt1;

    @Column(name="opt2", nullable = false)
    private String opt2;

    @Column(name="opt3", nullable = false)
    private String opt3;

    @Column(name="opt4", nullable = false)
    private String opt4;

    @Column(name="answer", nullable = false)
    private int answer;

    @Column(name="tags")
    private String tags;

    @Column(name="note")
    private String note;

    @Column(name="category", nullable = false)
    private String category;

    @Column(name="level")
    private int level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return id == quiz.id &&
                answer == quiz.answer &&
                level == quiz.level &&
                Objects.equals(question, quiz.question) &&
                Objects.equals(opt1, quiz.opt1) &&
                Objects.equals(opt2, quiz.opt2) &&
                Objects.equals(opt3, quiz.opt3) &&
                Objects.equals(opt4, quiz.opt4) &&
                Objects.equals(tags, quiz.tags) &&
                Objects.equals(note, quiz.note) &&
                Objects.equals(category, quiz.category);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, question, opt1, opt2, opt3, opt4, answer, tags, note, category, level);
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt1='" + opt1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                ", answer=" + answer +
                ", tags='" + tags + '\'' +
                ", note='" + note + '\'' +
                ", category='" + category + '\'' +
                ", level=" + level +
                '}';
    }
}