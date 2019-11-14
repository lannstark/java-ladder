package ladder.domain;

import java.util.List;

public class LadderInput {

	private final Participants participants;
	private final LadderResults ladderResults;

	public LadderInput(Participants participants) {
		this(participants, new LadderResults(participants.getNames()));
	}

	public LadderInput(String[] inputNames, String[] inputResult) {
		this(new Participants(inputNames), new LadderResults(inputResult));
		validateInputData(inputNames, inputResult);
	}

	private LadderInput(Participants participants, LadderResults ladderResults) {
		this.participants = participants;
		this.ladderResults = ladderResults;
	}

	private void validateInputData(String[] inputNames, String[] inputResult) {
		if (inputNames.length != inputResult.length) {
			throw new IllegalArgumentException("사다리에 참여하는 사람 수와 결과 수는 다를 수 없습니다");
		}
	}

	public List<String> getNames() {
		return participants.getNames();
	}

	public int count() {
		return participants.count();
	}

	public List<String> getResult() {
		return ladderResults.getResult();
	}

}
