public class laptop {
    public String type;
    public String producer;
    public String model;
    public double diagonal;
    public String procName;
    public int coresNumber;
    public int procFrequency;
    public int ramSize;
    public int hdSize;
    public String opSystem;

    public laptop(String type, String producer, String model, double diagonal, String procName, int coresNumber, 
        int procFrequency, int ramSize, int hdSize, String opSystem) {
            this.type = type;
            this.producer = producer;
            this.model = model;
            this.diagonal = diagonal;
            this.procName = procName;
            this.coresNumber = coresNumber;
            this.procFrequency = procFrequency;
            this.ramSize = ramSize;
            this.hdSize = hdSize;
            this.opSystem = opSystem;
    }
    
}