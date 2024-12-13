package com.bangkit.tanamoretest.reminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0015J\u001e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0017H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bangkit/tanamoretest/reminder/AddReminderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/bangkit/tanamoretest/databinding/ActivityAddReminderBinding;", "getBinding", "()Lcom/bangkit/tanamoretest/databinding/ActivityAddReminderBinding;", "binding$delegate", "Lkotlin/Lazy;", "selectedDay", "", "selectedMonth", "selectedYear", "addTask", "", "taskTitle", "", "selectedDate", "selectedHour", "selectedMinute", "reminderType", "loadTaskList", "", "LReminder;", "sharedPreferences", "Landroid/content/SharedPreferences;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveTaskList", "taskList", "scheduleDailyNotification", "task", "scheduleNotification", "app_debug"})
public final class AddReminderActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private int selectedYear = 0;
    private int selectedMonth = 0;
    private int selectedDay = 0;
    
    public AddReminderActivity() {
        super();
    }
    
    private final com.bangkit.tanamoretest.databinding.ActivityAddReminderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addTask(java.lang.String taskTitle, java.lang.String selectedDate, int selectedHour, int selectedMinute, java.lang.String reminderType) {
    }
    
    private final java.util.List<Reminder> loadTaskList(android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    private final void saveTaskList(android.content.SharedPreferences sharedPreferences, java.util.List<Reminder> taskList) {
    }
    
    private final void scheduleNotification(Reminder task) {
    }
    
    private final void scheduleDailyNotification(Reminder task) {
    }
}