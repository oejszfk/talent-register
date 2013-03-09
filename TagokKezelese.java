/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.jszfk;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szakkolegium
 */
public class TagokKezelese {

    private List<TagBean> tagLista = new ArrayList<TagBean>();

    public void add(TagBean tb) throws Exception {

        if (tb == null) {
            throw new Exception();
        }

        for (TagBean t : tagLista) {
            if (t.getRegisztraciosSzam() == tb.getRegisztraciosSzam()) {
                throw new Exception();
            }
        }

        tagLista.add(tb);

    }

    public void Remove(int regisztraciosszam) throws Exception {
        boolean igaz = false;
        for (TagBean i : tagLista) {
            if (i.getRegisztraciosSzam() == regisztraciosszam) {
                i.setStatusz("Kilépett");
                igaz = true;
            }
        }
        if (igaz == false) {
            throw new Exception("Nincs ilyen tag");
        }
    }

    public TagBean Find(int regisztraciosSzam) throws Exception {
        int i = 0;
        while (i < tagLista.size() && tagLista.get(i).getRegisztraciosSzam() != regisztraciosSzam) {
            i++;
        }
        if (i < tagLista.size()) {
            return tagLista.get(i);
        } else {
            throw new Exception();
        }
    }

    public void Modifie(TagBean t) throws Exception {
        TagBean tb=Find(t.getRegisztraciosSzam());
        if (!tb.equals(t)) throw new Exception();
    }
}
