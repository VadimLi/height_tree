package streams;

import java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {

    public Buffer(int size) {
        this.size_ = size;
    }

    private int maxFinishTime = 0;
    private Queue<Integer> finish_time_ = new ArrayDeque<>();

    public Response Process(Request request) {
        // write your code here

        int arrivalTime = request.arrival_time;

        // this handles the wait if the next packet doesn't arrive immediately
        if (maxFinishTime < arrivalTime) {
            maxFinishTime = arrivalTime;
        }

        // remove all finish_times lesser or equal than request.arrival_time
        while (!finish_time_.isEmpty() && (arrivalTime >= finish_time_.peek())) {
            finish_time_.remove();
        }

        // count the number of packets in finish_time_: this is how many packages are currently in the buffer
        int countPacketsInBuffer = this.finish_time_.size();

        if (countPacketsInBuffer < this.size_) {
            // get the time when the buffer becomes empty
            int bufferFinishTime = maxFinishTime;

            // add a new package to the buffer
            maxFinishTime = maxFinishTime + request.process_time;
            finish_time_.add(maxFinishTime);

            return new Response(false, bufferFinishTime);
        } else {
            return new Response(true, -1);
        }
    }

    private int size_;

}
