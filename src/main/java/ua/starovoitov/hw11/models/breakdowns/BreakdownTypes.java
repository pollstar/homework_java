package ua.starovoitov.hw11.models.breakdowns;

public enum BreakdownTypes {
    ALL_OK("All OK"),
    DISPLAY("defective display "),
    KEYBOARD("defective keyboard "),
    CHIP("defective chip "),
    ANTENNA("defective antenna "),
    BATTERY("defective battery ");
    private String type;
    BreakdownTypes(String type) {
        this.type = type;
    }

    public String getType() {return this.type;}
}
