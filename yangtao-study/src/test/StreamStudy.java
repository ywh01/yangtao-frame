// package yangtao.love.service.study.stream;
//
// import com.alibaba.fastjson.JSON;
//
// import java.util.*;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
//
// /**
//  * @Classname StreamStudy
//  * @Description Stream表达式学习
//  * @Date 2024/3/6 22:35
//  * @Author ywh
//  */
// public class StreamStudy {
//
//
//
//     public static void main(String[] args) {
//
//         List<User> userList = new ArrayList<>();
//         User userYang = new User("1", "小杨", 18);
//         userList.add(userYang);
//         User userWang = new User("2", "小王", 16);
//         userList.add(userWang);
//         User userLi = new User("3", "小李", 20);
//         userList.add(userLi);
//
//         // 1. filter过滤
//         /**
//          * 小杨
//          */
//         userList.stream()
//                 .filter(item -> item.getCode().equals("1"))
//                 .forEach(item -> {
//                     System.out.println(item.getName());
//                 });
//
//         // 2. map用法1，提取code
//         /**
//          * ["1","2","3"]
//          */
//         List<String> codeList = userList.stream().map(User::getCode).collect(Collectors.toList());
//         System.out.println(JSON.toJSONString(codeList));
//
//         // 2. map用法2，便利修改当前对象，不产生新对象
//         /**
//          * [{"age":18,"code":"1","name":"小杨"},{"age":18,"code":"2","name":"小王"},{"age":18,"code":"3","name":"小李"}]
//          */
//         userList.stream().map(item -> {
//             item.setAge(18);
//             return item;
//         }).collect(Collectors.toList());
//         System.out.println(JSON.toJSONString(userList));
//
//         // 3. flatMap,将一个Stream中的每个元素转换为另一个Stream，然后将所有转换后的Stream合并为一个新的Stream
//         /**
//          * [hello, world, java, stream]
//          */
//         List<String> list1 = Arrays.asList("hello", "world");
//         List<String> list2 = Arrays.asList("java", "stream");
//
//         List<String> result = Stream.of(list1, list2)
//                 .flatMap(Collection::stream)
//                 .collect(Collectors.toList());
//         System.out.println(result);
//
//         // 4. sort
//         /**
//          * [{"age":16,"code":"2","name":"小王"},{"age":18,"code":"1","name":"小杨"},{"age":20,"code":"3","name":"小李"}]
//          */
//         List<User> sortUserList = userList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
//         System.out.println(JSON.toJSONString(sortUserList));
//
//         // 5. skip
//         /**
//          * [{"age":16,"code":"2","name":"小王"},{"age":20,"code":"3","name":"小李"}]
//          */
//         List<User> skipUserList = userList.stream().skip(1).collect(Collectors.toList());
//         System.out.println(JSON.toJSONString(skipUserList));
//
//         // 6. limit
//         /**
//          * [{"age":18,"code":"1","name":"小杨"}]
//          */
//         List<User> limitUserList = userList.stream().limit(1).collect(Collectors.toList());
//         System.out.println(JSON.toJSONString(limitUserList));
//
//         // 7. distinct
//         /**
//          * 添加一个重复元素之后去重， [{"age":18,"code":"1","name":"小杨"},{"age":16,"code":"2","name":"小王"},{"age":20,"code":"3","name":"小李"}]
//          */
//         User userLiCopy = new User("3", "小李", 20);
//         userList.add(userLiCopy);
//         List<User> distinctUserList = userList.stream().distinct().toList();
//         System.out.println(JSON.toJSONString(distinctUserList));
//
//         // 1. reduce:
//         /**
//          * Sum of numbers: 15
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         int sum = numbers.stream().reduce(0, (acc, x) -> acc + x);
//         System.out.println("Sum of numbers: " + sum);
//
//
//         // 2. foreach:
//         /**
//          * Alice
//          * Bob
//          * Charlie
//          */
//         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//         names.stream().forEach(System.out::println);
//
//
//         // 3. collect:
//         /**
//          * Squares of numbers: [1, 4, 9, 16, 25]
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
//         System.out.println("Squares of numbers: " + squares);
//
//
//         // 4. allMatch:
//         /**
//          * Are all numbers even? false
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         boolean allEven = numbers.stream().allMatch(x -> x % 2 == 0);
//         System.out.println("Are all numbers even? " + allEven);
//
//
//         // 5. anyMatch:
//         /**
//          * Are there any even numbers? true
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         boolean anyEven = numbers.stream().anyMatch(x -> x % 2 == 0);
//         System.out.println("Are there any even numbers? " + anyEven);
//
//
//         // 6. noneMatch:
//         /**
//          * true
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         boolean noneNegative = numbers.stream().noneMatch(x -> x < 0);
//         System.out.println(noneNegative);
//
//
//         // 7. findFirst:
//         /**
//          * First name: Alice
//          */
//         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//         Optional<String> first = names.stream().findFirst();
//         System.out.println("First name: " + first.orElse("None"));
//
//
//         // 8. findAny:
//         /**
//          * Any name: Alice
//          */
//         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//         Optional<String> any = names.stream().findAny();
//         System.out.println("Any name: " + any.orElse("None"));
//
//
//         // 9. max:
//         /**
//          * Max number: 5
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         Optional<Integer> maxNum = numbers.stream().max(Integer::compare);
//         System.out.println("Max number: " + maxNum.orElse(0));
//
//
//         // 10. min:
//         /**
//          * Min number: 1
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         Optional<Integer> minNum = numbers.stream().min(Integer::compare);
//         System.out.println("Min number: " + minNum.orElse(0));
//
//
//         // 11. count:
//         /**
//          * Number of elements: 5
//          */
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         long count = numbers.stream().count();
//         System.out.println("Number of elements: " + count);
//     }
//
// }
