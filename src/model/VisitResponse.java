package model;

public class VisitResponse {
    private int floorId;
    private int selectedBall;

    public VisitResponse(int floorId, int selectedBall) {
        this.floorId = floorId;
        this.selectedBall = selectedBall;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getSelectedBall() {
        return selectedBall;
    }

    public void setSelectedBall(int selectedBall) {
        this.selectedBall = selectedBall;
    }

}
