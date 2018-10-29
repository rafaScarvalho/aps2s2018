/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * tratamentodedados.Ordenacao Ordena = new tratamentodedados.Ordenacao();
        Vetor vetor = new Vetor();
        int[] vet = null;
        if (rRandonico.isSelected())
        {
            VetorRandom rand = new VetorRandom();
            vet = rand.CriarVetor();
        }
        else
        {
            vet = vetor.CriarVetor(this.caminho);
        }
        int[] vet1 = vet;
        int[] vet2 = vet;
        int[] vet3 = vet;

        if (rSelectionsort.isSelected())
        {
            Ordena.selectionsort(vet1);
            lblSelect.setText(Integer.toString((int) Ordena.temposelectionsort)
                    + " milesegundos");
        }
        if (rBubbleSort.isSelected())
        {
            Ordena.bubbleSort(vet2);
            lblBubble.setText(Integer.toString((int) Ordena.tempobubbleSort)
                    + " milesegundos");
        }
        if (rInsertonSort.isSelected())
        {
            Ordena.insertonsort(vet3);
            lblInset.setText(Long.toString(Ordena.temposelectionsort)
                    + " milesegundos");
        }

        if (rSelectionsort.isSelected() && rBubbleSort.isSelected())
        {
            if (Ordena.tempobubbleSort < Ordena.temposelectionsort)
            {
                JOptionPane.showMessageDialog(null, "bubbleSort "
                        + Ordena.tempobubbleSort + " milesegundos "
                        + "\n selectionsort " + Ordena.temposelectionsort + " milesegundos "
                        + "\n bubbleSort foi mais eficiente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "bubbleSort "
                        + Ordena.tempobubbleSort + " milesegundos "
                        + "\n selectionsort " + Ordena.temposelectionsort + " milesegundos "
                        + "\n selectionsort foi mais eficiente");
            }
        }

        if (rSelectionsort.isSelected() && rInsertonSort.isSelected())
        {
            if (Ordena.tempoinsertonsort < Ordena.temposelectionsort)
            {
                JOptionPane.showMessageDialog(null, " insertonsort "
                        + Ordena.tempoinsertonsort + " milesegundos "
                        + "\n selectionsort " + Ordena.temposelectionsort + " milesegundos "
                        + "\n insertonsort foi mais eficiente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, " insertonsort "
                        + Ordena.tempoinsertonsort + " milesegundos "
                        + "\n selectionsort " + Ordena.temposelectionsort + " milesegundos "
                        + "\n selectionsort foi mais eficiente");
            }
        }
        if (rInsertonSort.isSelected() && rBubbleSort.isSelected())
        {
            if (Ordena.tempobubbleSort < Ordena.tempoinsertonsort)
            {
                JOptionPane.showMessageDialog(null, "bubbleSort "
                        + Ordena.tempobubbleSort + " milesegundos "
                        + "\n insertonsort " + Ordena.tempoinsertonsort + " milesegundos "
                        + "\n bubbleSort foi mais eficiente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "bubbleSort "
                        + Ordena.tempobubbleSort + " milesegundos "
                        + "\n insertonsort " + Ordena.tempoinsertonsort + " milesegundos "
                        + "\n insertonsort foi mais eficiente");
            }
        }
 */
public class Controle
{
    Ordenacao sort = new Ordenacao();
    public String TempoBS;
    public String TempoSS;
    public String TempoIS;
    public String TempoQS;
    
    public int[] Boubblesort (int[] vetor)
    {

        sort.bubbleSort(vetor);
        TempoBS = Integer.toString((int) sort.tempobubbleSort) + " milisegundos";
        return vetor;
        
    }
    
    public int[] selectionsort (int[] vetor)
    {
        sort.selectionsort(vetor);
        TempoSS = Integer.toString((int) sort.temposelectionsort) + " milisegundos";
        return vetor;
    }
    
    public int[] insertonsort (int[] vetor)
    {
        sort.insertonsort(vetor);
        TempoIS = Integer.toString((int) sort.tempoinsertonsort) + " milisegundos";
        return vetor;
    }
    
    public int[] quicksort(int[] vetor,int inicio, int fim)
    {
        sort.quickSort(vetor, inicio, fim);
        TempoQS = Integer.toString((int) sort.tempoquickSort ) + " milisegundos";
        return vetor;
    }
    
    public int[] criavertor()
    {
        GeraVetor cria = new GeraVetor();
        return cria.CriarVetor();
    }
            
    public int[] PegaVetor(String caminho)
    {
        PegaVetor pega = new PegaVetor();
        return pega.CriarVetor(caminho);
    }
}
