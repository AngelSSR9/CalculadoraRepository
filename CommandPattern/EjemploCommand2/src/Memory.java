import java.util.Stack;

public class Memory {
    private Stack<Command> memories = new Stack<>();
    
    public void recopilarRespuesta(Command rpta){
        memories.push(rpta);
    }
    
    public Command devolverRespuesta(){
        return memories.peek();
    }
    
    public boolean isEmpty() { return memories.isEmpty(); }

    public Stack<Command> getMemories() {
        return memories;
    }
}
