package vineet.raj.testapplication;

/**
 * Created by vineet on 10-Nov-16.
 */

public class Questions {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Questions(int TextResId, boolean AnswerTrue){
        mTextResId=TextResId;
        mAnswerTrue=AnswerTrue;
    }
}
