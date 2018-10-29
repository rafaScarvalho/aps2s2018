package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PegaVetor
{

    public int[] CriarVetor(String caminho)
    {
        List lista = new ArrayList();
        try
        {
            File arquivo = new File(caminho);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo))))
            {
                while (br.ready())
                {
                    int linha = Integer.parseInt(br.readLine());
                    lista.add(linha);
                }
            }
            int[] vet = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                vet[i] = (int) lista.get(i);
            }
            return (vet);
        }
        catch (IOException | NumberFormatException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }

    public void imrpimeVetor(int[] vet)
    {
        for (int pos = 0; pos < vet.length; pos++)
        {
            System.out.println(pos + 1 + " " + vet[pos]);
        }
    }
}