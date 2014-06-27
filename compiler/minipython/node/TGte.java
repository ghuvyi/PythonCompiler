/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TGte extends Token
{
    public TGte()
    {
        super.setText(">=");
    }

    public TGte(int line, int pos)
    {
        super.setText(">=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TGte(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGte(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TGte text.");
    }
}