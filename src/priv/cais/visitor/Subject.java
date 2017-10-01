package priv.cais.visitor;
public interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  