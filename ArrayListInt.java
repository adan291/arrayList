
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] collection;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {

    }

    /**
     * Metodo añade un elemento a la colección al final de la misma.
     */
    public void addElemento (int elemento)
    {
        //nueva lista creada
        int[] newList = new int[collection.length + 1];
        //copiado de lista antigua en la nueva
        for (int index = 0; index < collection.length; index++ )
        {
            newList[index] = collection[index];
        }
        //agregado de nuevo elemento en la nueva lista
        newList[collection.length] = elemento;

        //guardado de la nueva lista
        collection = newList;

    }

    /**
     * Metodo añade un elemento a la colección en la posición especificada por el parámetro.
     */
    public void addElementoPosicion (int index, int elemento)
    {

    }
}
