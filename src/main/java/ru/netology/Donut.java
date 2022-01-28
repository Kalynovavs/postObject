package ru.netology;

public class Donut {
    private Boolean isDonut;
    private int paidDuration;
    private Boolean canPublishFreeCopy;
    private String editMode;
    // Пустой объект заглушка
    // private Placeholder placeholder;
    public Boolean getDonut() {
        return isDonut;
    }

    public void setDonut(Boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Boolean getCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(Boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
