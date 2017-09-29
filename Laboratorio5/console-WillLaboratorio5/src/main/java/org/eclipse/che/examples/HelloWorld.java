package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Node a = new Node();
        a.setPropiedad("GUA");
        
        Node b = new Node();
        b.setPropiedad("MEX");
        a.setNext(b);
        
        Node c = new Node();
        c.setPropiedad("USA");
        a.getNext().setNext(c);
        
        Node d = new Node();
        d.setPropiedad("ESP");
        a.getNext().getNext().setNext(d);
        
        System.out.println(a.getPropiedad());
        System.out.println(a.getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getNext().getPropiedad());
        
        
        SingleLinkedList lista = new SingleLinkedList();
        lista.addFirst("Gua");
        lista.addLast("Mex");
        lista.addLast("Usa");
        lista.addLast("Jap");
        lista.addLast("Fra");
        lista.addLast("Rus");
        lista.addLast("Ita");
        lista.addLast("Sui");
        lista.addLast("Esp");
        String valor = lista.removeFirst();
        while(valor != null){
            System.out.println(valor);
            valor = lista.removeFirst();
        }
    }
    
    /**
     * Inner class Node
     */
    private static class Node{
        private String propiedad;
        private Node next;
        
        private String getPropiedad(){
            return this.propiedad;
        }
        private void setPropiedad(String propiedad){
            this.propiedad = propiedad;
        }
        private Node getNext(){
            return this.next;
        }
        private void setNext(Node next){
            this.next = next;
        }
    }
}
