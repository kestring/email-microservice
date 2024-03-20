package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Email")
public class Email implements Serializable {

    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendEmailDate;
    private StatusEmail statusEmail;

    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendEmailDate() {
        return sendEmailDate;
    }

    public void setSendEmailDate(LocalDateTime sendEmailDate) {
        this.sendEmailDate = sendEmailDate;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailId=" + emailId +
                ", userId=" + userId +
                ", emailFrom='" + emailFrom + '\'' +
                ", emailTo='" + emailTo + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", sendEmailDate=" + sendEmailDate +
                ", statusEmail=" + statusEmail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (!Objects.equals(emailId, email.emailId)) return false;
        if (!Objects.equals(userId, email.userId)) return false;
        if (!Objects.equals(emailFrom, email.emailFrom)) return false;
        if (!Objects.equals(emailTo, email.emailTo)) return false;
        if (!Objects.equals(subject, email.subject)) return false;
        if (!Objects.equals(text, email.text)) return false;
        if (!Objects.equals(sendEmailDate, email.sendEmailDate))
            return false;
        return Objects.equals(statusEmail, email.statusEmail);
    }

    @Override
    public int hashCode() {
        int result = emailId != null ? emailId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (emailFrom != null ? emailFrom.hashCode() : 0);
        result = 31 * result + (emailTo != null ? emailTo.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (sendEmailDate != null ? sendEmailDate.hashCode() : 0);
        result = 31 * result + (statusEmail != null ? statusEmail.hashCode() : 0);
        return result;
    }
}
