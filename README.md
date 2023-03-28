# tight-vertices
Find all the path from vertex 1 to vertex 13 using DFS to see the "Tight vertices"

Original Problem:

Quiz 7
A13
Cho đồ thị vô hướng liên thông . Ta gọi đỉnh sÎV là đỉnh “thắt” của cặp đỉnh u, vÎV nếu mọi đường đi từ u đến v đều phải qua s. Dựa vào thuật toán duyệt theo chiều sâu (DFS), hãy tìm tất cả các đỉnh thắt của cặp đỉnh u=1,v=13 trên đồ thị G được biểu diễn dưới dạng danh sách kề dưới đây:
Ke(1) = { 2, 3, 4}.
Ke(5) = {3, 6, 7, 8, 12}.	
Ke(9) = {10, 11, 13}.
Ke(2) = {1, 3, 4, 6}.	
Ke(6) = {2, 5, 7, 12}.		
Ke(10) = {9, 11, 12, 13}.
Ke(3) = {1, 2, 4, 5}.	
Ke(7) = {4, 5, 6, 8}.	
Ke(11) = {9, 10, 13}.
Ke(4) = {1, 2, 3, 7}.	
Ke(8) = {5, 7, 12}.       	
Ke(12) = {5, 6, 8, 10}.
Ke(13) = {9, 10, 11}.	
