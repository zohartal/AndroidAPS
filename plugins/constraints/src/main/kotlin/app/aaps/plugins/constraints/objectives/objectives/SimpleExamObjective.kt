package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.plugins.constraints.R
import dagger.android.HasAndroidInjector

class SimpleExamObjective(injector: HasAndroidInjector) : Objective(
    injector,
    "simple_exam",
    R.string.objectives_simple_exam_objective,
    R.string.objectives_simple_exam_gate
) {
    init {
        tasks.add(
            ExamTask(this, R.string.objectives_simple_exam_label, R.string.objectives_simple_exam_question, "simple_exam")
                .option(Option(R.string.objectives_simple_exam_yes, true))
                .option(Option(R.string.objectives_simple_exam_no, false))
                .learned(Learned(R.string.objectives_simple_exam_learned))
        )
    }
} 