package lotto.view;

import lotto.dto.LottoDto;
import lotto.dto.LottosDto;
import lotto.model.Lottos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OuputView {
    private static final String LOTTO_COST_PROMPT = "구입금액을 입력해 주세요.";
    private static final String LOTTO_COUNT_MESSAGE = "%d개를 구매했습니다.\n";
    private static final String WINNING_NUMBERS_PROMPT = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_PROMPT = "보너스 번호를 입력해 주세요.";

    public void displayLottoCostPrompt(){
        System.out.println(LOTTO_COST_PROMPT);
    }

    public void displayLottos(LottosDto lottosDto){
        System.out.printf(LOTTO_COUNT_MESSAGE,lottosDto.lottoCount());

        for(LottoDto lottoDto : lottosDto.lottos()){
            List<Integer> sortedLottoNumbers = new ArrayList<>(lottoDto.numbers());
            Collections.sort(sortedLottoNumbers);
            System.out.println(sortedLottoNumbers);
        }
    }

    public void displayWinningNumbersPrompt(){
        System.out.println(WINNING_NUMBERS_PROMPT);
    }

    public void displayBonusNumberPrompt(){
        System.out.println(BONUS_NUMBER_PROMPT);
    }
}
