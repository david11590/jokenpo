package br.com.jokenpo.jokenpo.util;

import br.com.jokenpo.jokenpo.dto.RoundAndStatus;

import java.util.List;

public class RoundJokenpo
{
    List<RoundAndStatus> listRoundStatus;

    private static RoundJokenpo instance;

    private RoundJokenpo(){}

    public static synchronized RoundJokenpo getInstance()
    {
        if (instance == null) instance = new RoundJokenpo();
        return instance;
    }
}
